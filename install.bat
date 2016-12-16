@ECHO OFF
cd /d "%~dp0"
cmd /k mvn clean install -Dmaven.test.skip=true -DskipTests=true -U
@ECHO ON