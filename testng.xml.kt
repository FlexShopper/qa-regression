<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE suite SYSTEM "http://testng.org/testng-1.0.dtd">
<suite name="Product Test Suite" verbose="1" parallel="tests" thread-count="1" configfailurepolicy="continue">
    <test name="Product Acceptance Tests" annotations="JDK" preserve-order="true">
        <classes>
            <class name="TestRunner"/>
        </classes>
    </test>
</suite>