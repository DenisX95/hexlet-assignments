@import exercise.repository.PostRepository
@import exercise.model.Post

@param int pageNumber

@template.layout.page(
    content = @`
        <ul>
        @for(Post post : PostRepository.findAll(pageNumber, 5))
            <li><a href="/posts/${post.getId()}">${post.getName()}</a></li>
        @endfor
        </ul>
        <div>
        @if(pageNumber > 1)
            <a href="/posts?page=${pageNumber - 1}">Previous</a>
        @endif
            <a href="/posts?page=${pageNumber + 1}">Next</a>
        </div>
    `
)
