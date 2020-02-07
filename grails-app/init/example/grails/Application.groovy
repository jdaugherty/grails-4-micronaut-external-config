package example.grails

import grails.boot.GrailsApp
import grails.boot.config.GrailsAutoConfiguration

import groovy.transform.CompileStatic

@CompileStatic
class Application extends GrailsAutoConfiguration {
    static void main(String[] args) {
        if(!System.hasProperty('micronaut.config.files')) {
            List<String> configLocations = ["file:conf/external-config.groovy"]
            System.properties['micronaut.config.files'] = configLocations.join(",")
        }
        GrailsApp.run(Application, args)
    }
}