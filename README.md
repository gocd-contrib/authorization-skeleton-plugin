# GoCD Authorization Plugin Skeleton

This is merely a skeleton plugin that plugin developers can fork to get quickly started with writing authorization plugins for GoCD.

All the documentation is hosted [here](https://plugin-api.gocd.io/current/authorization/)

## Getting started

* Edit the file `build.gradle` to change the plugin id, description and some other metadata
* Edit the file `settings.gradle` to change the name of this project
* Add your icon to plugin by changing class `GetPluginIconExecutor.java` (Note: place your icon under `resources` folder)
* Edit the file `GetCapabilitiesExecutor.java` to provide your plugin capabilities
* Edit the `GetAuthConfigMetadataExecutor.java`, `Configuration.java` and `auth-config.template.html` files to add any plugin auth configuration fields that should be shown in the view
* Edit the file `VerifyConnectionRequestExecutor.java` for perform any connection check on given auth config
* Edit the `GetRoleConfigMetadataExecutor.java`, `RoleConfiguration.java` and `role-config.template.html` files to add any role configuration fields that should be shown in the view
* Edit `UserAuthenticationExecutor.java` to perform authentication and authorization of user
* If your plugins supports search, then edit `SearchUserExecutor.java`

## Building the code base

To build the jar, run `./gradlew clean test assemble`

## License

```plain
Copyright 2023 Thoughtworks, Inc.

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```

## About the license and releasing your plugin under a different license

The skeleton code in this repository is licensed under the Apache 2.0 license. The license itself specifies the terms
under which derivative works may be distributed (the license also defines derivative works). The Apache 2.0 license is a
permissive open source license that has minimal requirements for downstream licensors/licensees to comply with.

This does not prevent your plugin from being licensed under a different license as long as you comply with the relevant
clauses of the Apache 2.0 license (especially section 4). Typically, you clone this repository and keep the existing
copyright notices. You are free to add your own license and copyright notice to any modifications.

This is not legal advice. Please contact your lawyers if needed.
