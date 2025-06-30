# Classical Music API

A Spring Boot REST API for managing classical music information, including artists, their biographies, and related data.

## Overview

This project is a RESTful API built with Spring Boot that provides endpoints for managing classical music data. It features comprehensive documentation using OpenAPI (Swagger) and follows modern Java development practices.

## Technologies

- Java 21
- Spring Boot 3.5.3
- SpringDoc OpenAPI (Swagger UI)
- Maven
- Docker

## Prerequisites

To run this application, you need:

- Java Development Kit (JDK) 21 or later
- Maven 3.6 or later
- Docker (optional, for containerization)

## Getting Started

### Clone the Repository

```bash
git clone [repository-url]
cd classical-api
```

### Build the Project

```bash
./mvnw clean install
```

### Run the Application

```bash
./mvnw spring-boot:run
```

The application will start on `http://localhost:8080/api/artists`

### API Documentation

Once the application is running, you can access the Swagger UI documentation at:

```
http://localhost:8080/swagger-ui.html
```

## API Endpoints

### Artists

- `GET /api/artists` - Get all artists
- `GET /api/artists/{id}` - Get artist by ID
- `POST /api/artists` - Create a new artist
- `PUT /api/artists/{id}` - Update an existing artist
- `DELETE /api/artists/{id}` - Delete an artist

## Docker Support

To build and run the application using Docker:

```bash
# Build the Docker image
docker build -t classical-api .

# Run the container
docker run -p 8080:8080 classical-api
```

## Contributing

1. Fork the repository
2. Create your feature branch (`git checkout -b feature/amazing-feature`)
3. Commit your changes (`git commit -m 'Add some amazing feature'`)
4. Push to the branch (`git push origin feature/amazing-feature`)
5. Open a Pull Request

## License

This project is licensed under the MIT License - see the LICENSE file for details.
