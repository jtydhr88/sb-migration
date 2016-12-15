# sb-migration
How to migrate service builder to module project

RoadMap
Migrate Local service
Copy Local Service Impl -> new Path
Migrate service.properties
Read the key/value from old
Migrate portlet-model-hints.xml
Copy portlet-model-hints.xml -> new Path
Migrate model
Copy Model Impl -> Path
Migrate Remote service + permission
Copy Service Impl -> new Path
Split resource-actions/default.xml -> new Path
Change the portlet-ref value in default.xml  to something 
Make Permission Check Class to Osgi component
Change to new osgi way to get Service if there are using Service in Permission Check class
Add permission package to the export list in bnd.bnd
Migrate Dynamic Query
Migrate Custom Sql
Migrate Comparator
Migrate JSON Web Service
Migrate SOAP Web Service
Migrate Asset
Migrate Exportimport
Migrate Rating
Migrate social
Migrate Trash


Steps
Create a sb module project.
Run build-service
Copy service.xml
Copy LocalServiceImpl + ServiceImpl
Copy resource file resource-actions/default.xml and split into two files 
Change to new osgi way to get Service if there are using Service in Permission Check class
Copy permission check class service/permission/XXX and make it to osgi componet
Copy portlet-model-hints.xml
Fix BC
Fix bnd.bnd in api project if the exports worry
Run build-service
