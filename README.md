# App de Sorteio criado no Android Studio

Este repositório mostra a criação de uma interface de um aplicativo simples no Android Studio.

## Pré-requisitos:
- Instação do Android Studio.

## Interface do Aplicativo criado:
<img width="486" alt="app sorteio - git" src="https://github.com/fariasangelica/Testes_Web/assets/98922466/e2bb5878-faec-44a5-8275-3b2d9c689b13">

## Estrutura do projeto:
```
└───aplicacaoteste
    ├───.gradle
    │   ├───8.2
    │   │   ├───checksums
    │   │   ├───dependencies-accessors
    │   │   ├───executionHistory
    │   │   ├───fileChanges
    │   │   ├───fileHashes
    │   │   └───vcsMetadata
    │   ├───buildOutputCleanup
    │   ├───kotlin
    │   │   ├───errors
    │   │   └───sessions
    │   └───vcs-1
    ├───.idea
    ├───app
    │   ├───build
    │   │   ├───generated
    │   │   │   └───res
    │   │   │       ├───pngs
    │   │   │       │   └───debug
    │   │   │       └───resValues
    │   │   │           └───debug
    │   │   ├───intermediates
    │   │   │   ├───aar_metadata_check
    │   │   │   │   └───debug
    │   │   │   ├───annotation_processor_list
    │   │   │   │   └───debug
    │   │   │   ├───apk
    │   │   │   │   └───debug
    │   │   │   ├───apk_ide_redirect_file
    │   │   │   │   └───debug
    │   │   │   ├───app_metadata
    │   │   │   │   └───debug
    │   │   │   ├───assets
    │   │   │   │   └───debug
    │   │   │   ├───compatible_screen_manifest
    │   │   │   │   └───debug
    │   │   │   ├───compile_and_runtime_not_namespaced_r_class_jar
    │   │   │   │   └───debug
    │   │   │   ├───compressed_assets
    │   │   │   │   └───debug
    │   │   │   │       └───out
    │   │   │   ├───data_binding_layout_info_type_merge
    │   │   │   │   └───debug
    │   │   │   │       └───out
    │   │   │   ├───data_binding_layout_info_type_package
    │   │   │   │   └───debug
    │   │   │   │       └───out
    │   │   │   ├───desugar_graph
    │   │   │   │   └───debug
    │   │   │   │       └───out
    │   │   │   │           ├───currentProject
    │   │   │   │           │   ├───dirs_bucket_0
    │   │   │   │           │   ├───dirs_bucket_1
    │   │   │   │           │   ├───dirs_bucket_2
    │   │   │   │           │   ├───dirs_bucket_3
    │   │   │   │           │   ├───jar_39ee262edfd325c21184640e53aa950527adb0d2961858a5616d1be35b843148_bucket_0
    │   │   │   │           │   ├───jar_39ee262edfd325c21184640e53aa950527adb0d2961858a5616d1be35b843148_bucket_1
    │   │   │   │           │   ├───jar_39ee262edfd325c21184640e53aa950527adb0d2961858a5616d1be35b843148_bucket_2
    │   │   │   │           │   └───jar_39ee262edfd325c21184640e53aa950527adb0d2961858a5616d1be35b843148_bucket_3
    │   │   │   │           ├───externalLibs
    │   │   │   │           ├───mixedScopes
    │   │   │   │           └───otherProjects
    │   │   │   ├───dex
    │   │   │   │   └───debug
    │   │   │   │       ├───mergeExtDexDebug
    │   │   │   │       ├───mergeLibDexDebug
    │   │   │   │       │   ├───0
    │   │   │   │       │   ├───1
    │   │   │   │       │   ├───10
    │   │   │   │       │   ├───11
    │   │   │   │       │   ├───12
    │   │   │   │       │   ├───13
    │   │   │   │       │   ├───14
    │   │   │   │       │   ├───15
    │   │   │   │       │   ├───2
    │   │   │   │       │   ├───3
    │   │   │   │       │   ├───4
    │   │   │   │       │   ├───5
    │   │   │   │       │   ├───6
    │   │   │   │       │   ├───7
    │   │   │   │       │   ├───8
    │   │   │   │       │   └───9
    │   │   │   │       └───mergeProjectDexDebug
    │   │   │   │           ├───0
    │   │   │   │           ├───1
    │   │   │   │           ├───10
    │   │   │   │           ├───11
    │   │   │   │           ├───12
    │   │   │   │           ├───13
    │   │   │   │           ├───14
    │   │   │   │           ├───15
    │   │   │   │           ├───2
    │   │   │   │           ├───3
    │   │   │   │           ├───4
    │   │   │   │           ├───5
    │   │   │   │           ├───6
    │   │   │   │           ├───7
    │   │   │   │           ├───8
    │   │   │   │           └───9
    │   │   │   ├───dex_archive_input_jar_hashes
    │   │   │   │   └───debug
    │   │   │   ├───dex_number_of_buckets_file
    │   │   │   │   └───debug
    │   │   │   ├───duplicate_classes_check
    │   │   │   │   └───debug
    │   │   │   ├───external_file_lib_dex_archives
    │   │   │   │   └───debug
    │   │   │   ├───external_libs_dex_archive
    │   │   │   │   └───debug
    │   │   │   │       └───out
    │   │   │   ├───external_libs_dex_archive_with_artifact_transforms
    │   │   │   │   └───debug
    │   │   │   │       └───out
    │   │   │   ├───incremental
    │   │   │   │   ├───debug
    │   │   │   │   │   ├───mergeDebugResources
    │   │   │   │   │   │   ├───merged.dir
    │   │   │   │   │   │   │   ├───values
    │   │   │   │   │   │   │   └───values-night-v8
    │   │   │   │   │   │   └───stripped.dir
    │   │   │   │   │   └───packageDebugResources
    │   │   │   │   │       ├───merged.dir
    │   │   │   │   │       │   ├───values
    │   │   │   │   │       │   └───values-night-v8
    │   │   │   │   │       └───stripped.dir
    │   │   │   │   ├───debug-mergeJavaRes
    │   │   │   │   │   └───zip-cache
    │   │   │   │   ├───mergeDebugAssets
    │   │   │   │   ├───mergeDebugJniLibFolders
    │   │   │   │   ├───mergeDebugShaders
    │   │   │   │   └───packageDebug
    │   │   │   │       └───tmp
    │   │   │   │           └───debug
    │   │   │   │               └───zip-cache
    │   │   │   ├───java_res
    │   │   │   │   └───debug
    │   │   │   │       └───out
    │   │   │   │           ├───com
    │   │   │   │           │   └───example
    │   │   │   │           │       └───aplicacao_teste
    │   │   │   │           └───META-INF
    │   │   │   ├───local_only_symbol_list
    │   │   │   │   └───debug
    │   │   │   ├───manifest_merge_blame_file
    │   │   │   │   └───debug
    │   │   │   ├───merged_java_res
    │   │   │   │   └───debug
    │   │   │   ├───merged_jni_libs
    │   │   │   │   └───debug
    │   │   │   │       └───out
    │   │   │   ├───merged_manifest
    │   │   │   │   └───debug
    │   │   │   ├───merged_manifests
    │   │   │   │   └───debug
    │   │   │   ├───merged_res
    │   │   │   │   └───debug
    │   │   │   ├───merged_res_blame_folder
    │   │   │   │   └───debug
    │   │   │   │       └───out
    │   │   │   │           ├───multi-v2
    │   │   │   │           └───single
    │   │   │   ├───merged_shaders
    │   │   │   │   └───debug
    │   │   │   │       └───out
    │   │   │   ├───mixed_scope_dex_archive
    │   │   │   │   └───debug
    │   │   │   │       └───out
    │   │   │   ├───navigation_json
    │   │   │   │   └───debug
    │   │   │   ├───packaged_manifests
    │   │   │   │   └───debug
    │   │   │   ├───packaged_res
    │   │   │   │   └───debug
    │   │   │   │       ├───drawable
    │   │   │   │       ├───layout
    │   │   │   │       ├───mipmap-anydpi-v26
    │   │   │   │       ├───mipmap-hdpi-v4
    │   │   │   │       ├───mipmap-mdpi-v4
    │   │   │   │       ├───mipmap-xhdpi-v4
    │   │   │   │       ├───mipmap-xxhdpi-v4
    │   │   │   │       ├───mipmap-xxxhdpi-v4
    │   │   │   │       ├───values
    │   │   │   │       ├───values-night-v8
    │   │   │   │       └───xml
    │   │   │   ├───processed_res
    │   │   │   │   └───debug
    │   │   │   │       └───out
    │   │   │   ├───project_dex_archive
    │   │   │   │   └───debug
    │   │   │   │       └───out
    │   │   │   │           └───com
    │   │   │   │               └───example
    │   │   │   │                   └───aplicacao_teste
    │   │   │   ├───runtime_symbol_list
    │   │   │   │   └───debug
    │   │   │   ├───signing_config_versions
    │   │   │   │   └───debug
    │   │   │   ├───source_set_path_map
    │   │   │   │   └───debug
    │   │   │   ├───stable_resource_ids_file
    │   │   │   │   └───debug
    │   │   │   ├───sub_project_dex_archive
    │   │   │   │   └───debug
    │   │   │   │       └───out
    │   │   │   ├───symbol_list_with_package_name
    │   │   │   │   └───debug
    │   │   │   ├───validate_signing_config
    │   │   │   │   └───debug
    │   │   │   └───variant_model
    │   │   │       └───debug
    │   │   ├───kotlin
    │   │   │   └───compileDebugKotlin
    │   │   │       ├───cacheable
    │   │   │       │   └───caches-jvm
    │   │   │       │       ├───inputs
    │   │   │       │       ├───jvm
    │   │   │       │       │   └───kotlin
    │   │   │       │       └───lookups
    │   │   │       ├───classpath-snapshot
    │   │   │       └───local-state
    │   │   ├───outputs
    │   │   │   └───logs
    │   │   ├───snapshot
    │   │   │   └───kotlin
    │   │   └───tmp
    │   │       └───kotlin-classes
    │   │           └───debug
    │   │               ├───com
    │   │               │   └───example
    │   │               │       └───aplicacao_teste
    │   │               └───META-INF
    │   ├───libs
    │   └───src
    │       ├───androidTest
    │       │   └───java
    │       │       └───com
    │       │           └───example
    │       │               └───aplicacao_teste
    │       ├───main
    │       │   ├───java
    │       │   │   └───com
    │       │   │       └───example
    │       │   │           └───aplicacao_teste
    │       │   └───res
    │       │       ├───drawable
    │       │       ├───layout
    │       │       ├───mipmap-anydpi-v26
    │       │       ├───mipmap-hdpi
    │       │       ├───mipmap-mdpi
    │       │       ├───mipmap-xhdpi
    │       │       ├───mipmap-xxhdpi
    │       │       ├───mipmap-xxxhdpi
    │       │       ├───values
    │       │       ├───values-night
    │       │       └───xml
    │       └───test
    │           └───java
    │               └───com
    │                   └───example
    │                       └───aplicacao_teste
    └───gradle
        └───wrapper
```
