## Selenium-Automation

### Description

Join our GitHub repository to explore the world of Selenium test scripts. All skill levels are welcome as we learn and improve together. Let's dive into Selenium testing and grow as a community.

### Table of Contents

1. Prerequisites
2. Installation
3. Running the Tests
4. Report Generation
5. Contact

### Prerequisites

1. Java
2. Eclipse IDE or IntelliJ IDEA
3. Git Version Control

<!-- Refer [CONTRIBUTING.md](https://github.com/Malitthh/selenium-automation/blob/main/CONTRIBUTING.md) before sending a PR. -->

### Installation

### Installation

For creating a new project,

1. Open Eclipse:
   Launch Eclipse IDE if it's not already open.

2. Create a New Project:
   Go to the "File" menu.
   Select "New" and then "Other..."
   In the "Select a wizard" dialog, expand the "Maven" folder.
   Choose "Maven Project" and click "Next."
   Select Project Type:

3. Make sure "Create a simple project (skip archetype selection)" is selected.
   Click "Next."

4. Configure Project:
   Enter the "Group Id" and "Artifact Id" for your project. These identifiers help uniquely identify your project.
   Choose the location where you want your project to be created.
   Ensure that the "Use default Workspace location" option is selected.
   Click "Next."

5. Add Dependencies:
   Open the `pom.xml` file.
   You can add dependencies by adding `<dependency>` elements inside the `<dependencies>` section. These dependencies will be downloaded and included in your project automatically.
   Save the `pom.xml` file.

6. Installing Selenium WebDriver  & TestNG (Test Next Generation) Using `pom.xml`:
   Add Selenium WebDriver Dependencies, Within the `<dependencies>` section of the `pom.xml` file, add the following lines to include Selenium WebDriver dependencies for Java:
   ```xml
   <dependencies>
       <!-- Other dependencies may be listed here -->
       <!-- Selenium WebDriver for Java -->
       <dependency>
           <groupId>org.seleniumhq.selenium</groupId>
           <artifactId>selenium-java</artifactId>
           <version>3.141.59</version> <!-- Use the desired version -->
       </dependency>
   </dependencies>

   <dependencies>
    <!-- Other dependencies may be listed here -->
    <!-- TestNG -->
    <dependency>
        <groupId>org.testng</groupId>
        <artifactId>testng</artifactId>
        <version>7.4.0</version> <!-- Use the latest version -->
        <scope>test</scope>
    </dependency>
</dependencies>

   
### Running the Tests


### Report Generation


### Contact

<!-- Please log your concern [CONTACT.md](https://github.com/Malitthh/selenium-automation/blob/main/CONTACT.md) -->
