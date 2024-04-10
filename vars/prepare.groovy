def call() {
	def script_content = libraryResource 'helloWorld.sh'
	writeFile file: 'hello_world.sh', text: script_content
	sh "bash hello_world.sh"
}
