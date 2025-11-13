# 🚀 DevSecOps Pipeline Project

This repository demonstrates a **fully automated DevSecOps pipeline** for a Java Maven project using **GitHub Actions**, **SonarCloud**, and **Snyk** for continuous integration, code quality checks, and vulnerability scanning.  
It also includes an **interactive dashboard** hosted on GitHub Pages to visualize build, vulnerability, and code quality metrics in real-time.

---

## 🔍 Features
- ✅ **Automated CI/CD** with GitHub Actions  
- 🔒 **Static Code Analysis** via **SonarCloud**  
- 🛡 **Dependency & License Scanning** via **Snyk**  
- ⚡ **Maven Build Automation**  
- ☕ Supports **Java 22 (Temurin distribution)**  
- 📊 **Interactive Dashboard** with Chart.js  
- ⏱ Automatic update of metrics (`data.json`) on every push  

---

## ⚙️ Tools & Technologies
- **GitHub Actions** → Workflow automation  
- **SonarCloud** → Code quality & security scanning  
- **Snyk** → Vulnerability & license scanning  
- **Maven** → Dependency management & build tool  
- **Java JDK 22** → Runtime environment  
- **Chart.js** → Interactive charts for the dashboard  
- **GitHub Pages** → Host the live dashboard  

---

## 📁 Folder Structure
devsecops-pipline-project/
├── .github/
│ └── workflows/
│ └── devsecops-pipeline.yml # CI/CD workflow
└── docs/
├── index.html # Interactive dashboard
└── data.json # JSON metrics file updated by workflow

yaml
Copy code

---

## 🛠 Pipeline Workflow
1. Checkout repository  
2. Setup Java JDK 22  
3. Cache Maven and SonarCloud dependencies  
4. Build project and run JUnit tests  
5. Run Snyk vulnerability scan  
6. Analyze code quality with SonarCloud  
7. Generate `docs/data.json` dynamically with build, Snyk, and Sonar metrics  
8. Commit updated `data.json` back to the repo  
9. GitHub Pages automatically updates the dashboard  

---

## 📊 Dashboard
- **Live Charts** using Chart.js:
  - Doughnut chart for Build & Test status  
  - Bar chart for Snyk vulnerabilities  
  - Radar chart for SonarCloud Quality Gate metrics  
- Auto-refreshes to show latest metrics  
- Displays **“Last Updated” timestamp**  
- **GitHub Pages URL:**  
[View Dashboard](https://tushant-thakur.github.io/devsecops-pipline-project/index.html)  

---

## ✅ Badges
- ![Build Status](https://github.com/Tushant-Thakur/devsecops-pipline-project/actions/workflows/devsecops-pipeline.yml/badge.svg?branch=main)  
- ![Snyk Status](https://snyk.io/test/github/Tushant-Thakur/devsecops-pipline-project/badge.svg)  
- ![SonarCloud Quality Gate](https://sonarcloud.io/api/project_badges/measure?project=Tushant-Thakur_devsecops-pipline-project&metric=alert_status)  

---

## 📈 How to Use / Test Locally
1. Clone the repository:  
```bash


Make a change and push to main → workflow updates metrics → dashboard updates automatically.

📝 Notes
Dashboard automatically fetches latest metrics from data.json.

SonarCloud Security Hotspots can be reviewed and marked safe to pass Quality Gate.

Workflow fully automates JSON updates, ensuring dashboard reflects real-time status.
