# DSMeta
<h4 align="center"> 
	 Project DSMeta
</h4>
<p align="center">
  <img alt="GitHub language count" src="https://img.shields.io/github/languages/count/EliezerGarbin/DSMeta">

  <img alt="Repository size" src="https://img.shields.io/github/repo-size/EliezerGarbin/DSMeta">
	
  <a href="https://www.linkedin.com/in/eliezergarbin/">
    <img alt="Made by eliezergarbin" src="https://img.shields.io/badge/made%20by-EliezerGarbin-%2304D361">
  </a>

  <a href="https://github.com/EliezerGarbin/DSMeta/commits/main">
    <img alt="GitHub last commit" src="https://img.shields.io/github/last-commit/EliezerGarbin/DSMeta">
  </a>

  <img alt="License" src="https://img.shields.io/badge/License-Apache%202.0-brightgreen.svg">
   <a href="https://github.com/EliezerGarbin/DSMeta/stargazers">
    <img alt="Stargazers" src="https://img.shields.io/github/stars/EliezerGarbin/DSMeta?style=social">
  </a>
</p>
<p align="center">
<a href="https://app.getpostman.com/run-collection/eda2f21f2f69106b2188?action=collection%2Fimport"><img src="https://run.pstmn.io/button.svg" alt="Run in Postman"></a>
</p>

<p align="center">
  <a href="#project">Project</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
  <a href="layout">Layout</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
  <a href="#technologies">Technologies</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
  <a href="#how-to-use">How To Use</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
  <a href="#how-to-contribute">How to contribute</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
  <a href="#license">License</a>
</p>


## Project
DSMeta allows you to query salespeople and evaluate their sales performance.

This Project was created with Java, Spring Boot, Typescript, and H2 Database technologies, you can consult a table of sellers along with your sales data to evaluate your achieved goals and send an SMS with the seller's data, announcing that he has been the sales highlight, within a data-filtered period.

#### Backend
Using Java17 with Spring Boot, mapping the objects with JPA and integrating with H2, we pass through a seed of the database and create HTTPs requests where it generates data queries, and we implement the sending of SMS with Twilio.

#### Frontend
Typescript, React + React Hooks(lib), vite(build tool) and Axios to make HTTPs requests and leave a more basic syntax in the code. We also use libraries like DatePicker and toastify to make the project more practical.

<p align="center">
    <img src="https://user-images.githubusercontent.com/59988262/203082569-45d1fdfe-3f81-418d-bf82-2ce1be0fda1d.gif" alt="GIF DSMeta" title="Example" />

</p>

## Layout

To access the layout use [Figma](https://www.figma.com/file/EN1zFtk4eY3Jgmpgi9YaMG/DSMeta1).

## Technologies
This project was developed with the following technologies:

- [Java][java]
- [Spring Boot][spring]
- [H2][h2]
- [TypeScript][typescript]
- [React][reactjs]



## How To Use

To clone and run this application, you'll need [Git](https://git-scm.com), [Node.js][nodejs] + [Yarn][yarn] and [Java JDK][javase] + [Eclipse][eclipse] or your Java IDE preferably installed on your computer.

From your command line:

### Install Back-end

```bash
# Clone this repository
$ git clone https://github.com/EliezerGarbin/DSMeta.git


# Go into the repository
$ cd DSMeta/backend

# Open Eclipse in this directory

# Press Ctrl + Shift + Alt + B, R keys to start the application

# running on port 8080
```

### Install Front-end

```bash
# Clone this repository
$ git clone https://github.com/EliezerGarbin/DSMeta.git

# Go into the repository
$ cd DSMeta/frontend

# Run
$ yarn build

# running on port 5173
```



## How to contribute

- Make a fork;
- Create a branck with your feature: `git checkout -b my-feature`;
- Commit changes: `git commit -m 'feat: My new feature'`;
- Make a push to your branch: `git push origin my-feature`.

After merging your receipt request to done, you can delete a branch from yours.

## License

This project is under the Apache 2.0 license. See the [LICENSE](https://github.com/eliezergarbin/DSMeta/blob/main/LICENSE) for details.


Made with by Eliézer Garbin :wave: [Get in touch!](https://www.linkedin.com/in/eliezergarbin/)

[java]: https://www.java.com/en/
[javase]: https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html
[spring]: https://spring.io/projects/spring-boot
[eclipse]: https://www.eclipse.org/downloads/
[reactjs]: https://reactjs.org
[typescript]: https://www.typescriptlang.org/
[h2]: https://www.h2database.com/html/main.html
[yarn]: https://yarnpkg.com/
[nodejs]: https://nodejs.org/
