# Pittsburgh Emergency Scanner

### Purpose:
- Launches and navigates broadcastify.com to my local emergency services public scanner channel.

### Tools used:
- Shell scripts + a Bash alias (PIT)
- AppleScript
- Java
- Selenium
- IntelliJ -> exec command line launcher

### Notes:
- Assuming you're using IntelliJ, all you would need to do is change is the ```driver.get("link")``` to your preferred service.

- I added a 30 sec wait time for IntelliJ to load before simulating the **^R** keystrokes. This could vary per user. 
