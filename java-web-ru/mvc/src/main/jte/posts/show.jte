@import exercise.dto.posts.PostPage
@import exercise.util.NamedRoutes
@param PostPage page

@template.layout.page(
    content = @`
        <main>
            <div class="mx-auto p-4 py-md-5">
                <h1>${page.getPost().getName()}</h1>
            </div>

            <div class="mx-auto p-4 py-md-5">
                ${page.getPost().getBody()}
            </div>
            <!-- BEGIN -->
            <a class="page-link" href="${NamedRoutes.editPostPath(page.getPost().getId())}" aria-label="Edit">
                <span aria-hidden="true">Редактировать</span>
            </a>
            <!-- END -->
        </main>
    `
)
