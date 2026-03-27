# mailer-test

This project uses Quarkus, the Supersonic Subatomic Java Framework.

This goal is to show the problem of using `Instance<Mailer>` injection without any concrete injected beans and
dynamically picking up configured only mailers.

In the current form the problem is as follows:

Only the default and the first mailer are being found when counting all mailer instances as it is being used by
direct injection within the `SomeService` if this bean would not exist no mailer will be found.

My conclusion is the only those mailers will be picked up that are directly injected either with or without a 
`@MailerName` qualifier.

## Running the application in dev mode

You can run your application in dev mode that enables live coding using:

```shell script
./gradlew quarkusDev
```

> **_NOTE:_**  Quarkus now ships with a Dev UI, which is available in dev mode only at <http://localhost:8080/q/dev/>.

## Packaging and running the application

The application can be packaged using:

```shell script
./gradlew build
```
