def call() {
	def script_python = libraryResource 'hello_world.py'
	writeFile file: './hello_world.py', text: script_python
	sh "python ./hello_world.py"
}
