#!/bin/bash

javac snackBar/*.java
jar cvfe snackBar.jar snackBar.Main snackBar/*.class
printf "\n"
java -jar snackBar.jar