import os

class FileSystem:
    def __init__(self):
        pass

    def ls(self, path):
        x = "" 
        for i in os.listdir(path):
            x += i+"\n"
        return x
        

    def mkdir(self, path):
        p = path.split("\\")
        aux_path = ""
        for i in p:
            try:
                aux_path += i + "\\"
                os.listdir(aux_path)
            except FileNotFoundError:
                print("----------Excepcion-------------")
                os.mkdir(aux_path)
                os.listdir(aux_path)


    def addContentToFile(self, file_path, file_content):
        f = open(file_path, "+a")
        f.write(file_content)


    def readContentFromFile(self, file_path):
        f = open(file_path, "r")
        content = ""
        for r in f.readlines():
            content += r
        return content

fs = FileSystem()
print(fs.ls("C:\\Users\\yohov\\Documents\\proyectos\\Leetode"))
fs.mkdir("C:\\Users\\yohov\\Documents\\yoho\\1\\2\\3\\4")
fs.addContentToFile("C:\\Users\\yohov\\Documents\\yoho\\s\\2.txt","\nholoaasdasdasda")
print(fs.readContentFromFile("C:\\Users\\yohov\\Documents\\yoho\\1.txt"))
