👋 Hi Everyone,

Hope you're all doing well!

This is a BDD Cucumber-based automation project where I have automated a login scenario for Naukri.com. Currently, the project includes automation for the Home Page and Login Page functionalities.

The primary goal of this project is to demonstrate:

✅ How to write and organize a Feature file

✅ How to implement Step Definitions

✅ How the Runner class executes the test

✅ How all these components interact within a BDD Cucumber framework

If you're getting started with BDD + Cucumber + Selenium, this project will give you a hands-on view of building a real-world test case.

I'll continue adding more scenarios and enhancements over time — including validations, utilities, data-driven testing, and reporting features and so on.....

✅ BDD Cucumber Framework Folder Structure

BDD_CucumberFramework/
│
├── src/
│   └── test/
│       ├── java/
│       │   ├── base/                # Common setup (Hooks, Base classes)
│       │   ├── pageobjects/         # Page classes (POM design pattern)
│       │   ├── stepdefinitions/     # Glue code: Step Definitions
│       │   └── runners/             # Test Runner class
│       │
│       └── resources/
│           └── features/            # All .feature files (Gherkin syntax)
│
├── target/                          # Compiled classes (should be ignored in .gitignore)
├── pom.xml                          # Maven configuration (dependencies, plugins)
├── testng.xml (optional)            # For TestNG integration
└── .gitignore


Thanks for checking it out!

Best regards,
Vijay Pundir


 ///////////////////////////////

 # Test commit for Jenkins webhook
 #test webhook trigger
 # Running again
 # Again rerun after update branch name
 # Again rerun after update repo url path
