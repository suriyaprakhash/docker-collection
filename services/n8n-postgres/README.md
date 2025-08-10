# n8n with PostgreSQL

Starts n8n with PostgreSQL as database. Referenced from [n8n-docker](https://github.com/n8n-io/n8n-docker).

![img_1.png](img/img_1.png)

## Start

Run n8n and postgres,
```
docker compose up
```

Navigate to [redis](../redis) and also run redis and redis insight

- Login to n8n at http://localhost:5678/
  - If you are seeing a blank screen, try importing 
    - [Basic AI Chat bot](sample-json/AI%20Chat%20with%20memory.json)
    - [Simple Form AI Chat](sample-json/Simple%20Form%20AI%20Chat.json)

## Basic AI chat bot example

- This uses the chat mechanism to send messages to the bot.
- Will use the session to remember the conversation in the redis.

![basic-ai-chat](img/basic%20ai%20chat.png)
    
## Simple Form AI chat example

This could be used to submit a form or do some other simple task that's not back and forth

- This uses **username** and **prompt** as input.
- **username** is for the Key for the redis memory to remember the conversation.
- **prompt** is the message to be sent to the bot.![img.png](img/img.png)