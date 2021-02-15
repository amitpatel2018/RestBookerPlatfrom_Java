Feature: Book a Room
Scenario: Book a single room
Given User navigated to "https://aw1.automationintesting.online/"
When User clicks on Book a Room
And User selects three days for a room
And User enters his details
Then User got room booking confirmation
