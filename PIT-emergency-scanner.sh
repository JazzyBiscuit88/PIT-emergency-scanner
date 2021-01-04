#!/bin/bash

# open IntelliJ project
sh ~/projects/PIT-emergency-scanner/runner.sh

# loading wait time
sleep 30s

# run keystrokes via apple script
echo "Simulating keys..."
osascript ~/projects/PIT-emergency-scanner/intelliJ-program-runner.scpt
echo "Running project..."

exit 0

