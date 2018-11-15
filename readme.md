# ColorSensorRobot sample app

This app simply instantiates the TCS34725 color sensor, connected to the onboard roboRio I2C port, so that you can see r, g, b, c values on the Live Window variables pane.

To build, copy down the TCS34725I2CRoboRio project in the same directory as this project.

In the Live Window, you should see TCS34725_I2C(0), with a type RGBColorSensor, with the values R, G, B, C.  These should be fetchable the smart dashboard classes.

Until I can get the color sensor pushed to a Maven repo, if you want a new project to be able to reference the sensor's jar file, you need to:

1.  Copy the TCS34725I2CRoboRio to the same directory as your new project.
2.  Put the following at the bottom of the new project's settings.gradle file:
```
include 'TCS34725I2CRoboRio'
project(':TCS34725I2CRoboRio').projectDir = new File(settingsDir, '../TCS34725I2CRoboRio')
```
3.  The put this into the build.gradle dependencies directive:
```
compile project(path: ':TCS34725I2CRoboRio')
```