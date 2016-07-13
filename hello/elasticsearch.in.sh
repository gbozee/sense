ES_MIN_MEM=48m
ES_HEAP_NEWSIZE=128m
ES_MAX_MEM=256m
JAVA_OPTS=" -XX:+UseG1GC -server "
ES_HOME=/usr/share/elasticsearch
ES_CLASSPATH=$ES_CLASSPATH:$ES_HOME/lib/elasticsearch-2.3.3.jar:$ES_HOME/lib/*:$ES_HOME/lib/sigar/*
if [ "x$ES_MIN_MEM" = "x" ]; then
    ES_MIN_MEM=256m
fi
if [ "x$ES_MAX_MEM" = "x" ]; then
    ES_MAX_MEM=1g
fi
if [ "x$ES_HEAP_SIZE" != "x" ]; then
    ES_MIN_MEM=$ES_HEAP_SIZE
    ES_MAX_MEM=$ES_HEAP_SIZE
fi
JAVA_OPTS="$JAVA_OPTS -Xms${ES_MIN_MEM}"
JAVA_OPTS="$JAVA_OPTS -Xmx${ES_MAX_MEM}"
if [ "x$ES_HEAP_NEWSIZE" != "x" ]; then
    JAVA_OPTS="$JAVA_OPTS -Xmn${ES_HEAP_NEWSIZE}"
fi
if [ "x$ES_DIRECT_SIZE" != "x" ]; then
    JAVA_OPTS="$JAVA_OPTS -XX:MaxDirectMemorySize=${ES_DIRECT_SIZE}"
fi
JAVA_OPTS="$JAVA_OPTS -Djava.awt.headless=true"
if [ "x$ES_USE_IPV4" != "x" ]; then
  JAVA_OPTS="$JAVA_OPTS -Djava.net.preferIPv4Stack=true"
fi
JAVA_OPTS="$JAVA_OPTS -XX:+HeapDumpOnOutOfMemoryError"
JAVA_OPTS="$JAVA_OPTS -Dfile.encoding=UTF-8"
