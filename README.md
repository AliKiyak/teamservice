# Team service 
This is the micro service that handles all calls directly associated with the **Team** entity. It contains the standard GET, PUT, POST and delete methods. It also contains different sorts of methods, e.g find a team by its id, find a team containing e certain string in their name and etc.

## Context
The Esports wiki allows you to find every bit of information about the games, teams, tournaments and players that are involved in Espors. You can look at them in detail, add, delete or even edit them. This way you can keep your own database about your favorite esports game / team.

## Installation
* Clone our project (git clone https://github.com/AliKiyak/teamservice.git)

## Usage
Run the project and make sure that the ZuulGateway, Eureka Server, Edge service and the other microservices are all running.
The functionality of the service can be tested while it is isolated from the other services.

## Client
This is a school project made for the course Java Advanced Topipcs

## Authors and acknowledgment
* Ali Kiyak (AliKiyak)
* Bosz Srisan (BoszS)
* René Vanhoof (VanhoofR)
* Chris Tophe (Christophe195)

## Associations
The team-service has associations with the **Game and Tournament** microservices. So make sure that these are running aswell.
