# SW Task

## Prerequisites

- Git
- Java 24
- Maven (or use the included `mvnw`)
- Docker and Docker Compose

## Installation & Setup

1. **Clone the repository:**
   ```bash
   git clone https://github.com/Geniools/sw-spring-boot-task.git
   cd sw-spring-boot-task

2. **Run the application:**
   Make sure you are using the correct Java version (Java 24). You can check your Java version with:
    ```bash
    java -version
    ```
   If you don't have the correct version, change the `JAVA_HOME` environment variable to point to the Java 24
   installation.

    ```bash
    export JAVA_HOME=/path/to/java24
    ```

   If you have Maven installed, run:

    ```bash
    mvn spring-boot:run
    ```

   Or, if you prefer using the included Maven wrapper:

    ```bash
    ./mvnw spring-boot:run
    ```
   **Note:** You will need to manually run MongoDB and Redis servers, or you can use the provided Docker setup.

   Alternatively, you can use Docker Compose to run the application:

    ```bash
    docker-compose up 
    ```

   or run the `run.sh` script to install docker, package and run the application:

    ```bash
    chmod +x run.sh
    sudo ./run.sh
    ```

3. **Access the application:**
   Open your web browser and go to `http://localhost:8080`.

