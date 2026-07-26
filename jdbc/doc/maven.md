# Maven

- Maven is a project management and build automation tool for Java projects. Its primary functions include:

    - Providing a standardized project structure.
      - Providing a standardized build lifecycle (compile, test, package, install, deploy, etc.).
      - Managing project dependencies.

## Maven model
- Repository
  - Local Repositor
    - Stores dependencies downloaded on your local machine.
  - Central Repository
    - The official public Maven repository maintained by the Maven community.
    - Contains millions of open-source libraries.
  - Remote Repository
    - A private or shared repository maintained by an organization
    - Used to host internal libraries and mirror external dependencies.
    - Examples: Nexus, Artifactory.
- Project Object Model(POM)
  - Describes a Maven project
  - Defined in pom.xml file
  - Contains project information, dependencies, plugins, and build configuration.
  
- Dependencies
  - External libraries required by the project
  - Maven automatically downloads and manages them
- Plugins
  - Extend Maven's functionality
  - USed during the build lifecycle
- pom.xml
  - The core configuration file of a Maven project
  - typically contains:
    - Project information
    - Dependencies
    - Plugins
    - Build configuration
    - Properties
    - Repository configuration

## Maven commands
- mvn compile:
  - Compiles the project's source code.
  - Generates .class files in the target directory.
- mvn clean: 
  - Deletes the target directory.
  - Removes all previously generated build files.
- mvn package:
  - Complies the code, run tests, and packages the application
  - Generates a JAR or WAR file in the target directory.
- mvn test:
  - Compiles and runs all unit tests.
  - Typically executes JUnit tests.
- mvn install 
  - Performs all steps of package
  - Installs the packaged artifact irepository (~/.m2/repository),
  making it available to other local Maven projects.nto the local Maven 

## Maven Build lifecycle
- The Maven Build Lifecycle describes the sequence of phases that a project goes through during the build process.
- Maven defines three built-in lifecycles:
  - 1. clean LifeCylce
    - removes files genenrated by previous builds
    - common phase:
      - pre-clean
      - clean
      - post-clean
  - 2. Default Lifecycle
    - Responsible for building the project
    - Common phases include:
      - compile
      - test
      - package
      - install
      - deploy
  - 3. Site Lifecycle
    - generate project documentation and reports
    - Common phases:
      - pre-site
      - site
      - post-site

## Lifecycle Order

>Clean Lifecycle
pre-clean → clean → post-clean

>Default Lifecycle
compile → test → package → install

>Site Lifecycle
pre-site → site → post-site

- **Important**

Within the same lifecycle,
executing a later phase automatically executes all preceding phases.

## Maven Coordinates
### What are Maven Coordinates?
- Maven coordinates uniquely identify a Maven artifact.
- They are used to identify a project or a dependency in a Maven repository.

### Main Components of Maven Coordinates
- groupId
    - Identifies the organization, company, or project that produces the artifact.
    - Typically follows the reverse domain name convention.
        >Example:
        <groupId>com.itheima</groupId>

- artifactId
    - Identifies the name of the project or module.
    - Usually corresponds to the project or module name.

    >Examples:
    order-service
    goods-service
    mysql-connector-j
  
- version
    - Specifies the version of the artifact.
    >Example:
    <version>1.0-SNAPSHOT</version>

