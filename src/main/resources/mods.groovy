MultiplatformModsDotGroovy.make {
    issueTrackerUrl = 'https://github.com/GroovyMC/GroovyBundler/issues'
    license = 'BSD-3-Clause'
    mod {
        modId = 'groovybundler'
        version = environmentInfo.version
        displayName = 'GroovyBundler'
        description = 'Bundles Groovy and related libraries for use by GML or GroovyDuvet'
        author = 'GroovyMC'
        displayUrl = 'https://github.com/GroovyMC/GroovyBundler'
    }
    onFabric {
        modmenu = [
                'badges':['library'],
                'parent':[
                        'id':'groovyduvet',
                        'name':'GroovyDuvet',
                        'description':'Language adapter and wrapper libraries for Groovy mods on Quilt/Fabric',
                        'icon':'assets/groovyduvet/icon.png',
                        'badges':['library']
                ]
        ]
        jars {
            buildProperties.bundled.collect { fileName ->
                jar {
                    file = "META-INF/jarjar/$fileName" as String
                }
            }
        }
    }
}
