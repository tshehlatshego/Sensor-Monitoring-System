# Sensor-Monitoring-System
A lightweight, object-oriented sensor framework built in Java. It provides a structured way to model, manage, and report on different types of sensors, each with its own activation logic, battery-boosting rules, and reporting format.

Features
Abstract Sensor Architecture
A base Sensor class defines the shared structure for all sensor types, allowing easy extension and customization.

Weather & Pressure Sensor Implementations
Two sensor types (WeatherSensor and PressureSensor) provide concrete behavior, including:

Online/offline state management

Battery boosting with configurable percentage increases and safety limits

Cleanly formatted object state reporting

Polymorphic Handling of Sensor Collections
A unified array of sensors is managed and processed using polymorphism, allowing seamless interaction with multiple sensor types.

Automatic Report Generation
Generates readable .txt files containing detailed reports for each sensor type. Sensors are filtered and exported based on their class.

Components
Sensor — abstract base class
WeatherSensor — subclass with 12.5% battery boost logic
PressureSensor — subclass with 15% battery boost logic
SensorDemo — handles sensor creation, processing, and file output
weather.txt & pressure.txt — generated reports
