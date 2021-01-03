GRPC Demo

* [GRPC Doc](https://www.grpc.io/docs/languages/node/basics/)
* [Protocol Buffer](https://developers.google.com/protocol-buffers)
* [Protoc](https://github.com/protocolbuffers/protobuf/releases/tag/v3.14.0)
* [GRPC Gen Java](https://repo1.maven.org/maven2/io/grpc/protoc-gen-grpc-java/1.34.1/)

## `protoc --plugin=protoc-gen-grpc-java=${GRPC_GEN_JAVA_PATH} -I=${path_to_resources} --java_out=${dest_dir} --grpc-java_out=${dest_dir} ${path_to_proto}`