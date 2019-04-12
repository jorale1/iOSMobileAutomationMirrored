# Setup instructions 


## Configuration in Unix systems 

Configure the .bash_profile in mac or the .bashrc in linux to include this environment variables 

```console
export IOS_APP_PATH={{PATH TO IOS .APP }}
export APPIUM_SERVER_HUB_URL={{ URL OF APPIUM SERVER HUB }}
```

## Configuration in Windows systems 

Setup the environment variables 

```console
setx  IOS_APP_PATH={{PATH TO IOS .APP }}
setx  APPIUM_SERVER_HUB_URL={{ URL OF APPIUM SERVER HUB }}
```

## Run tests 

```console
mvn verify
```

## Run tests via Jenkins

#### Setup environment variables

Manage Jenkins->Manage Nodes->Node->Configure->Environment Variables

1) Name: APPIUM_SERVER_HUB_URL

   Value: {{ URL OF APPIUM SERVER HUB }}

2) Name: IOS_APP_PATH

   Value: {{PATH TO IOS .APP }}
   


