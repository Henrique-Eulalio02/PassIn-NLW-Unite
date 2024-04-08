# ✅ Pass.In 

O pass.in é uma aplicação voltada para a gestão de eventos. Este projeto foi criado durante a NLW Unite, produzida pela [Rocketseat](https://app.rocketseat.com.br/).

## Requisitos Funcionais
- O organizador deve poder cadastrar um novo evento;
- O organizador deve poder visualizar dados de um evento;
- O organizador deve poder visualizar a lista de participantes;
- O participante deve poder se inscrever em um evento;
- O participante deve poder visualizar seu crachá de inscrição;
- O participante deve poder realizar check-in no evento.

## Regras de Negócio
- O participante só pode se inscrever em um evento uma única vez;
- O participante só pode se inscrever em eventos com vagas disponíveis;
- O participante só pode realizar check-in em um evento uma única vez.

## Requisitos Não-Funcionais
- O check-in no evento será realizado através de um QRCode.

## Tecnologias Utilizadas
- Java com ecossistema Spring;
  ### Dependências do Spring
  - Spring WEB;
  - Spring JPA;
  - Lombok;
  - FlyWay;
  - HSQLDB;
  - Spring DevTools.
- HyperSQL;
- Maven.

## Endpoints
As consultas à API foram realizadas pelo [Insomnia](https://insomnia.rest/download) e foram dividas em 2 rotas principais: events e attendees.
Todos os ID's foram extraídos via @PathVariable e o Post CheckIn, Post Attendee e o Post Event possuem UriComponentsBuilder para gerar um location ao serem criados.
### Eventos
- Get Event
```bash
  http://localhost:8080/events/{eventId}
```
- Post Event
```bash
  http://localhost:8080/events
```
> [!IMPORTANT]
> O Post Event espera um JSON contendo um DTO: String title, String details, int maximumAttendees 

- Get Attendee From Event
```bash
  http://localhost:8080/events/attendees/{eventId}
```
- Post Attendee
```bash
  http://localhost:8080/events/attendees/{eventId}
```
> [!IMPORTANT]
> O Post Attendee espera um JSON contendo um DTO: String name, String email
### Inscritos
- Get AttendeeBadge
```bash
  http://localhost:8080/attendees/{attendeeId}/badge
```
- Post CheckIn
```bash
  http://localhost:8080/attendees/{attendeeId}/check-in
```
