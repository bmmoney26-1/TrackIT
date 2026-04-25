# TrackIT

> **Tracking submissions is easy. Tracking understanding is the hard part.**

TrackIT is a student progress tracking application built to make the learning journey easier to navigate: for students and teachers alike. Students have one place to manage assignments, log blockers, organize notes tied to specific lessons, and rate their confidence on any topic. Teachers get real-time visibility into where their students are academically, without having to chase anyone down.

No more "did they understand it?": TrackIT shows you.

---

## The Problem

Tools like Google Classroom track *submissions*. Notion can hold notes. Spreadsheets can log grades. But none of them answer the question that matters most:

**Does the student actually understand the material?**

TrackIT takes the best of all of those tools and puts them in one place: with the layer that's always been missing: real-time insight into student understanding, friction, and growth.

---

## Versioning Philosophy

Each version of TrackIT is built to stand completely on its own before the next one begins. Like puzzle pieces: every part is complete, and they connect into something larger.

| Version | Focus | Status |
|---|---|---|
| V1 | Student-facing REST API: personal learning tracker | 🚧 In Progress |
| V2 | Multi-role institutional platform (Code Differently edition) | 🔲 Planned |
| V3+ | AI-powered learning coach layer | 🔲 Long-Term |

---

## Version 1: Student API

V1 is the foundation. A fully functional REST API built for the individual student. The goal of V1 is to get the core personal tracking experience right: clean, solid, and production-ready: before adding institutional roles or AI layers on top.

### What V1 Tracks

- **Assignments**: coding assignments and certification assignments, each with their own fields
- **Blockers**: what a student is stuck on, logged with topic and date
- **Learning Sessions**: study sessions with topic, duration, and confidence rating
- **Notes**: organized notes tied to sessions, assignments, or blockers
- **Progress Reports**: aggregated summaries per student per quarter

---

## Tech Stack

| Layer | Technology |
|---|---|
| Language | Java 17 |
| Framework | Spring Boot 3.5.12 |
| ORM | JPA / Hibernate |
| Database (dev) | H2 File Mode |
| Database (prod) | PostgreSQL (planned) |
| Build Tool | Maven |
| Testing | JUnit (in progress) |
| Version Control | GitHub: `dev` / `staging` / `main` |

---

## Architecture

TrackIT follows a clean four-layer Spring Boot architecture. Every layer has one job and stays in its lane.

```
HTTP Request → Controller → Service → Repository → Database
```

| Layer | Responsibility |
|---|---|
| Controller | Receives HTTP requests, returns JSON responses |
| Service | Business logic: the brain of the application |
| Repository | Talks to the database via JpaRepository |
| Database | Stores all student learning data |

---

## API Endpoints

### Students
| Method | Endpoint | Description |
|---|---|---|
| `POST` | `/students` | Create a new student |
| `GET` | `/students` | Get all students |
| `GET` | `/students/{id}` | Get student by ID |
| `PUT` | `/students/{id}` | Update student info |
| `DELETE` | `/students/{id}` | Delete a student |

### Blockers
| Method | Endpoint | Description |
|---|---|---|
| `POST` | `/blockers/{id}` | Log a blocker for a student |
| `GET` | `/blockers/{id}` | Get all blockers for a student |
| `PUT` | `/blockers/{id}` | Update a blocker |
| `DELETE` | `/blockers/{id}` | Delete a blocker |

### Notes
| Method | Endpoint | Description |
|---|---|---|
| `POST` | `/notes` | Create a note |
| `GET` | `/notes/{id}` | Get a note by ID |
| `PUT` | `/notes/{id}` | Update a note |
| `DELETE` | `/notes/{id}` | Delete a note |

### Assignments
| Method | Endpoint | Description |
|---|---|---|
| `GET` | `/assignments/{id}` | Get assignments for a student |
| `PATCH` | `/assignments/{id}` | Update assignment status |

---

## Running Locally

### Prerequisites
- Java 17
- Maven (included via wrapper: no separate install needed)

### Steps

```bash
# Clone the repository
git clone https://github.com/bmmoney26-1/TrackIT.git
cd TrackIT

# Run the application
./mvnw spring-boot:run
```

> ⚠️ Always use `./mvnw`: not `mvn`. The Maven wrapper ensures you're using the correct version bundled with the project.

### H2 Database Console

Once running, the H2 database console is available at:

```
http://localhost:8080/h2-console
```

| Field | Value |
|---|---|
| JDBC URL | `jdbc:h2:file:./data/trackitDB` |
| Username | `sa` |
| Password | *(leave blank)* |

> ⚠️ The `data/` folder is intentionally excluded from version control. Do not commit it.

---

## Data Model

TrackIT's data model is designed with deliberate structure. A few key architectural decisions:

- **Assignment is abstract**: `CodingAssignment` and `CertAssignment` extend it using JOINED inheritance. New assignment types can be added without restructuring the base.
- **Note connects through LearningSession**: not directly to Student. Notes only exist in context (a session, assignment, or blocker). This preserves meaning in the data.
- **Blocker connects to both Student and Assignment**: a student can be blocked on a general topic or on a specific piece of work.

---

## Roadmap

### V1: Wrapping Up
- [x] Entity layer (9 entities)
- [x] Repository layer (9 JpaRepository interfaces)
- [x] Service layer (12+ methods)
- [x] Controller layer (4 controllers, full CRUD)
- [x] Tested end to end in Postman
- [ ] Custom exceptions (`StudentNotFoundException`, etc.)
- [ ] Global exception handler (`@ControllerAdvice`)
- [ ] JUnit test suite
- [ ] PostgreSQL migration

### V2: Code Differently Edition (Planned)
- [ ] Multi-role instructor system (Coding Instructor, Director, Behavioral Coach, Hiring Manager)
- [ ] Job application tracker with real-time status dashboard
- [ ] Mass assignment tool with automatic student notifications
- [ ] Student-controlled public/private notes and blockers
- [ ] Flexible blocker system: log blockers on anything
- [ ] Spring Security: role-based access control

### Long-Term
- [ ] AI-powered learning coach layer
- [ ] Standalone personal mode for self-taught learners

---

## Contributing

V1 is a solo build. **V2 is open to contributors.**

If you're interested in collaborating on the Code Differently institutional version, reach out directly before opening a pull request.

---

## Author

**Bobby Money**
AI Engineering Track: Code Differently Bootcamp, Wilmington DE

[![LinkedIn](https://img.shields.io/badge/LinkedIn-Bobby%20Money-blue?style=flat&logo=linkedin)](https://www.linkedin.com/in/bobbymoneyjr/)
[![GitHub](https://img.shields.io/badge/GitHub-bmmoney26--1-black?style=flat&logo=github)](https://github.com/bmmoney26-1)
[![Email](https://img.shields.io/badge/Email-bmmoney261%40gmail.com-red?style=flat&logo=gmail)](mailto:bmmoney261@gmail.com)

---

*TrackIT: because understanding matters more than submission.*
