# Tractus X AAS Registry Test Cases
This package contains `test cases` for the [Tractusx aas registry](https://github.com/eclipse-tractusx/sldt-digital-twin-registry) which is runs against the `basyx registry` implementation.

## Test Cases
The tests includes the following test cases:
* test /shell-descriptors APIs (GET, POST, PUT, DELETE)
  * exludes fine granular access controls and authorization
  * includes EDC-BPN Header for control the shell visibility
* test /lookup discovery APIs

## TODOs
The `test cases` includes  both APIs (/shell-descriptors, /lookup),  because the `tractusx aas registry` runs both APIs together. 
In the basyx registry, the APIs are separated. Therefore, the test cases should be separated as well or the basyx registry should be extended to support both APIs.


