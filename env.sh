#!/bin/sh

set -eu

export JAVA_HOME=/home/richard/Projects/valhalla/build/linux-x86_64-normal-server-release/images/j2sdk-image/
export PATH=$JAVA_HOME/bin:$PATH
export LD_LIBRARY_PATH=$PWD

export compilation="-XX:+LogCompilation"
export trace="-XX:+TraceClassLoading"
export unlock="-XX:+UnlockDiagnosticVMOptions"
export REQUIRED_SWITCHES="$unlock $trace $compilation -XX:+PrintAssembly -XX:PrintAssemblyOptions=intel"

