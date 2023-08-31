ModsDotGroovy.make {
    issueTrackerUrl = 'https://github.com/GroovyMC/GroovyBundler/issues'
    license = 'MIT'
    mod {
        modId = 'groovybundler'
        version = this.version
        displayName = 'GroovyBundler'
        description = 'Bundles Groovy and related libraries for use by GML or GroovyDuvet'
        author 'GroovyMC'
        displayUrl = 'https://github.com/GroovyMC/GroovyBundler'
        dependencies {}
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
        jars = this.bundled.collect {
            ['file': "META-INF/jarjar/$it" as String]
        }
    }
}