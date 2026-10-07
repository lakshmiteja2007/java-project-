# Campus Course and Records Manager (CCRM)
Campus Course and Records Manager (CCRM) is a Java-based
application designed to manage student and course information.
The system allows academic departments to maintain records,
organize course offerings, and perform sorting operations
using utility classes.

## Features
- Student record management
- Course catalog management
- CSV-based data storage
- Utility methods for arrays and files
- Course and student sorting

## Requirements  
- Java 17 or later
## Compilation
Linux/macOS

javac -d out $(find src -name "*.java")

java -cp out edu.ccrm.cli.CCRMApplication

Windows PowerShell

mkdir out

javac -d out (Get-ChildItem -Recurse -Filter *.java).FullName

java -cp out edu.ccrm.cli.CCRMApplication
## Storage
Application data is stored in:

${user.home}/ccrm-storage

No external libraries are required.
