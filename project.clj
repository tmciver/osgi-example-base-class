(defproject base-class-lib "0.1.0-SNAPSHOT"
  :description "Test project for creating a gen-class'ed base class to be
  extended by another library."
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.6.0"]]
  :manifest {"Bundle-SymbolicName" "com.example.base"
             "Bundle-Name" "Base Class Bundle"
             "Import-Package" "clojure.lang"
             "Export-Package" "com.example.base,com.example"}
  :omit-source true
  :aot :all)
