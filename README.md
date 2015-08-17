# test-javafx

JavaFx with Google Guice (for dependency injection) and Guava's EventBus (for sub/pub between controllers).

* Instead of writing the UI code in Java, I use FXML to construct the UI.
    * https://github.com/choonchernlim/test-javafx/tree/master/src/main/resources/fxml
    * The simple reason for that is it greatly decouple UI code from service code.
    * Another reason is most UI code doesn't really need unit tests, hence doing so it will increase the code coverage for this project.
    * To decorate the UI, you can use CSS-like configuration: https://github.com/choonchernlim/test-javafx/blob/master/src/main/resources/css/app.css

* For communications between controllers, I use Guava's EventBus: https://code.google.com/p/guava-libraries/wiki/EventBusExplained
    * It removes bidirectional couplings between controllers since it uses pub/sub model.
    * Very clean code.
    * Example: https://github.com/choonchernlim/test-javafx/blob/master/src/main/java/com/github/choonchernlim/testJavaFx/controller/MainController.java
        * This class listens for an event by using @Subscribe annotation and react accordingly.
        * The way it works is `@Subscribe` listens to a specific event object type (any POJO will do). As long as the type matches, it will get triggered to do the work.

* For dependency injection, instead of using Spring, I use Google Guice: https://github.com/google/guice
    * Spring works, but it is too heavyweight for simple project like this.
    * Example: https://github.com/choonchernlim/test-javafx/blob/master/src/main/java/com/github/choonchernlim/testJavaFx/guice/GuiceModule.java
        * An example of Guice configuration.
        * Because Guice's binding is 100% explicit (no autowiring like Spring), they have to be defined here.
        * The beauty with this is I can easily bind EventBus written by Guava here too... no extra work need to inject non-Guice classes.

* The REAL magic of this toy project is my custom FXMLLoader.
    * https://github.com/choonchernlim/test-javafx/blob/master/src/main/java/com/github/choonchernlim/testJavaFx/service/impl/FxmlLoaderServiceImpl.java
    * When FXMLLoader tries to load the controller, I use Guice to perform the controller creation so that it handles all the dependency injections first.
    * Before returning the controller, I register the controller to the event bus automatically.
    * This prevents me from writing repetitive code to register each newly created controller to the event bus.