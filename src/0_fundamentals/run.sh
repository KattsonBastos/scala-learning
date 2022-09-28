#!bin/bash

# creating a variable to store the name of the file
class_name=Variables

# compiling and running the object
scalac $class_name.scala 
scala $class_name

# deleting files
rm $class_name.class 
rm $class_name\$.class
rm $class_name\$delayedInit\$body.class