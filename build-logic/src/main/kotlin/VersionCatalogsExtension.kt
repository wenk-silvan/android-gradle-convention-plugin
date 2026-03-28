import org.gradle.api.Project
import org.gradle.api.artifacts.VersionCatalog
import org.gradle.api.artifacts.VersionCatalogsExtension
import org.gradle.kotlin.dsl.getByType

val Project.libss: VersionCatalog
    get() = extensions.getByType<VersionCatalogsExtension>().named("libs")

// A shortcut to get a library as a Provider
fun VersionCatalog.findLibraryOrThrow(name: String) =
    findLibrary(name).orElseThrow { NoSuchElementException("Library $name not found in catalog") }