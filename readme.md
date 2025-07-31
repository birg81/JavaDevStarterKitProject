[![MIT License](https://img.shields.io/badge/License-MIT-green.svg)](https://choosealicense.com/licenses/mit/)
[![GPLv3 License](https://img.shields.io/badge/License-GPL%20v3-yellow.svg)](https://opensource.org/licenses/)
[![AGPL License](https://img.shields.io/badge/license-AGPL-blue.svg)](http://www.gnu.org/licenses/agpl-3.0)

<a name="TOP"></a>

<a href="#IT"><img style="height:25px" src="https://em-content.zobj.net/thumbs/60/whatsapp/352/flag-italy_1f1ee-1f1f9.png" /></a>
🤍
<a href="#EN"><img style="height:25px" src="https://em-content.zobj.net/thumbs/60/whatsapp/352/flag-united-kingdom_1f1ec-1f1e7.png" /></a>

<hr />


![🇬🇧](https://em-content.zobj.net/thumbs/60/whatsapp/352/flag-united-kingdom_1f1ec-1f1e7.png) <a name="EN"></A>

# 🚀 Java Dev Starter Kit: From Zero to Pro with Maven, Git, and JUnit

Welcome to this repository!
🚀 This is a Java console project designed to help you **learn Maven**, **write tests with JUnit**, and **manage projects with Git** via the command line.
It’s everything you need to start coding like a pro! 🧑‍💻💡

## 🔧 Project Goals

📚 **This is not a real-world app**, but a learning environment to:

- ✳️ Understand and use `Maven`
- 🔁 Run unit tests with `JUnit`
- 🧬 Manage source code with `Git` and connect to `GitHub`
- 👨‍🔬 Write and execute tests from the CLI
- ⚡ Automate development workflows (build, test, install, deploy)

## 🧱 Create a Java Project with Maven

To start a console-based Java application:

```bash
mvn archetype:generate \
	-DgroupId=<package> \
	-DartifactId=<AppName>	\
	-DarchetypeArtifactId=maven-archetype-quickstart \
	-DinteractiveMode=false
```

📁 This will generate a structure like:

```
src/
 └── main/java/pkg/App.java
 └── test/java/pkg/AppTest.java
```

---

## 🔁 Essential Maven Commands

| ⚙️ Task							|	🖥️ Maven Command									|
|-------------------------------|--------------------------------------------------|
| 🧰 Add Maven Wrapper			|	`mvn wrapper:wrapper`							|
| 🛠️ Compile project			|	`mvn compile`									|
| 🧪 Run tests					|	`mvn test`										|
| 📦 Create `.jar`				|	`mvn package`									|
| 🔍 Check plugin updates		|	`mvn versions:display-plugin-updates`			|
| 🎯 Check dependency updates	|	`mvn versions:display-dependency-updates`		|
| 🚀 Use latest versions		|	`mvn versions:use-latest-versions`				|
| 📄 Clean project				|	`mvn clean`										|

📌 Tip: use `./mvnw` instead of `mvn` to run with the bundled Maven Wrapper!

---

## 🧪 What’s a Test (and Why You Should Care)

A **test** is a small program that verifies another program works as expected ✅.
In Java, the most popular testing library is JUnit 🧪.

### JUnit 5 Example

```java
@Test
void testSum() {
	assertEquals(4, 2 + 2);
}
```

👉 Tests help you:

* ⚠️ Catch bugs early
* ♻️ Refactor safely
* ✅ Automatically validate code behavior

---

## 🌿 Git — Essential CLI Commands

### 🔑 Initial Configuration

```bash
git config --global user.name "Biagio"
git config --global user.email "birg81@gmail.com"
```

### 📁 Initialize and Link a Repository

```bash
git init
gh auth login  # login with GitHub CLI
gh repo create repo-name --public --source=. --remote=origin --push
```

Or manually on GitHub:

1. Create a new repo on [github.com](https://github.com)
2. Link it to your local project:

```bash
git remote add origin https://github.com/birg81/repo-name.git
git branch -M main
git push -u origin main
```

---

## 💡 Git: Basic Workflow

| 📝 Action				|	🖥️ Command										|
|------------------------|--------------------------------------------------|
| 📄 Add files			| `git add .` or `git add filename.java`			|
| 🧾 Commit changes		|	`git commit -m "Descriptive message"`			|
| 🚀 Push to GitHub		|	`git push`										|
| 🔄 Pull latest changes	|	`git pull`										|
| 🌿 Create a branch		|	`git checkout -b branch-name`					|
| ♻️ Rebase with main		|	`git fetch origin` + `git rebase origin/main`	|
| 🧹 Ignore files			|	Set up a `.gitignore` file (see below)			|

---

## 🧾 Sample `.gitignore` for Maven Projects

```gitignore
# Maven
/target/
.mvn/wrapper/maven-wrapper.jar
/mvnw
/mvnw.cmd

# IDE
.vscode/
.idea/

# System files
.DS_Store
*.class
*.log
```

---

## 📚 Final Tips

* 📦 Keep your **dependencies up to date** (`mvn versions:display-dependency-updates`)
* 🧪 Write **simple and frequent tests**
* 🌍 Use Git and GitHub for **backup and collaboration**
* 📖 Read official Maven docs at [https://maven.apache.org](https://maven.apache.org)
* 🧪 Explore JUnit docs at [https://junit.org/junit5/](https://junit.org/junit5/)

---

## 🙌 Happy learning!

*Every great project starts with an empty folder*, a `git init`, *and a whole lot of curiosity* 🌱🚀

<hr/>

![🇮🇹](https://em-content.zobj.net/thumbs/60/whatsapp/352/flag-italy_1f1ee-1f1f9.png) <a name="IT"></A>

# 🚀 Java Dev Starter Kit: Maven + Git + JUnit da Zero a Pro

Benvenuto in questo repository!
🚀 Qui troverai un progetto Java da console pensato esclusivamente per **apprendere l’utilizzo di Maven**, **i test con JUnit** e la **gestione di progetti con Git** da riga di comando.
Tutto ciò che serve per diventare uno sviluppatore più autonomo e professionale! 🧑‍💻💡

## 🔧 Obiettivo del Progetto

📚 **Questo progetto NON è un’applicazione reale**, ma un ambiente didattico per:

- ✳️ Comprendere e usare `Maven`
- 🔁 Eseguire test con `JUnit`
- 🧬 Gestire il codice con `Git` e collegarlo a `GitHub`
- 👨‍🔬 Scrivere test automatici da riga di comando
- ⚡ Automatizzare il ciclo di sviluppo (build, test, install, deploy)

## 🧱 Come creare un progetto Java con Maven

Per creare un'applicazione console Java:

```bash
mvn archetype:generate \
	-DgroupId=<package> \
	-DartifactId=<AppName> \
	-DarchetypeArtifactId=maven-archetype-quickstart \
	-DinteractiveMode=false \
````

📁 Verrà generata una struttura simile a:

```
src/
 └── main/java/pkg/App.java
 └── test/java/pkg/AppTest.java
```

---

## 🔁 Comandi Maven essenziali

|	⚙️ Obiettivo						|	🖥️ Comando Maven						|
|	--------------------------------	|	-------------------------------------	|
|	🧰 Aggiungere Maven Wrapper	  | `mvn wrapper:wrapper`				 |
|	🛠️ Compilare il progetto		| `mvn compile`						 |
|	🧪 Eseguire i test			   | `mvn test`							|
|	📦 Generare il `.jar`			| `mvn package`						 |
|	🔍 Cercare nuove versioni plugin	|	`mvn versions:display-plugin-updates`	|
|	🎯 Cercare nuove versioni delle dipendenze	|	`mvn versions:display-dependency-updates`	|
|	🚀 Usare l’ultima versione	   | `mvn versions:use-latest-versions`	|
|	📄 Pulire la build			   | `mvn clean`						   |

📌 Ricorda: usa `./mvnw` al posto di `mvn` per usare il Maven Wrapper incluso!

---

## 🧪 Cos'è un test (e perché è importante)?

Un **test** è un programma che verifica che un altro programma funzioni correttamente ✅.
In Java, JUnit è il framework più diffuso per scrivere test automatici 🧪.

### Esempio con `JUnit 5`

```java
@Test
void testSomma() {
	assertEquals(4, 2 + 2);
}
```

👉 I test ti aiutano a:

* ⚠️ Prevenire bug
* ♻️ Fare refactoring in sicurezza
* ✅ Validare funzionalità automaticamente

---

## 🌿 Git — Comandi essenziali da CLI

### 🔑 Configurazione iniziale

```bash
git config --global user.name "Biagio"
git config --global user.email "birg81@gmail.com"
```

### 📁 Inizializzare e collegare un repository

```bash
git init
gh auth login  # login a GitHub (se hai GitHub CLI installato)
gh repo create nome-repo --public --source=. --remote=origin --push
```

Oppure da GitHub manualmente:

1. Crea un repository su [github.com](https://github.com)
2. Collega il tuo progetto:

```bash
git remote add origin https://github.com/birg81/nome-repo.git
git branch -M main
git push -u origin main
```

---

## 💡 Git: Ciclo di lavoro

|	📝	Azione				|	🖥️	Comando									|
|	-----------------------	|	---------------------------------------------	|
|	📄	Aggiungere file	|	`git add .` o `git add nomefile.java`			|
|	🧾	Creare un commit		|	`git commit -m "Messaggio descrittivo"`		|
|	🚀	Pusciare su GitHub		|	`git push`									|
|	🔄	Recuperare modifiche	|	`git pull`									|
|	🌿	Creare branch		|	`git checkout -b nome-branch`					|
|	♻️	Rebase locale		|	`git fetch origin` + `git rebase origin/main`	|
|	🧹	Ignorare file		|	Configura `.gitignore` (vedi sotto)			|

---

## 🧾 Esempio `.gitignore` per progetti Maven

```gitignore
# Maven
/target/
.mvn/wrapper/maven-wrapper.jar
/mvnw
/mvnw.cmd

# IDE
.vscode/
.idea/

# File di sistema
.DS_Store
*.class
*.log
```

---

## 📚 Consigli Finali

* 📦 Mantieni le **dipendenze aggiornate** (`mvn versions:display-dependency-updates`)
* 🧪 Scrivi **test semplici e frequenti**
* 🌍 Usa Git e GitHub come **backup e collaborazione**
* 📖 Leggi la documentazione Maven su [https://maven.apache.org](https://maven.apache.org)
* 🧪 Approfondisci JUnit su [https://junit.org/junit5/](https://junit.org/junit5/)

---

## 🙌 Buon apprendimento!

*Ogni grande progetto parte da una directory vuota*, un `git init` *... e tanta curiosità* 🌱🚀

<a href="#TOP">&utrif; top &utrif;</a>

## 🔗 Links
[![linkedin](https://img.shields.io/badge/linkedin-0A66C2?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/biagio-rosario-greco-77145774/)
[![twitter](https://img.shields.io/badge/twitter-1DA1F2?style=for-the-badge&logo=twitter&logoColor=white)](https://twitter.com/birg_81)