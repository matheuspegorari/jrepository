package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class AnexoPergunta extends AbstractSankhyaEntity<AnexoPergunta> {
   private BigDecimal codPerg;
   private byte[] conteudo;
   private String descricao;
   private String nomeArquivo;
   private BigDecimal nuPesq;
   private BigDecimal sequencia;

   public BigDecimal getCodPerg() {
        return codPerg;
   }

   public void setCodPerg(BigDecimal codPerg) {
        markAsChanged("CODPERG", codPerg);
        this.codPerg = codPerg;
   }

   public byte[] getConteudo() {
        return conteudo;
   }

   public void setConteudo(byte[] conteudo) {
        markAsChanged("CONTEUDO", conteudo);
        this.conteudo = conteudo;
   }

   public String getDescricao() {
        return descricao;
   }

   public void setDescricao(String descricao) {
        markAsChanged("DESCRICAO", descricao);
        this.descricao = descricao;
   }

   public String getNomeArquivo() {
        return nomeArquivo;
   }

   public void setNomeArquivo(String nomeArquivo) {
        markAsChanged("NOMEARQUIVO", nomeArquivo);
        this.nomeArquivo = nomeArquivo;
   }

   public BigDecimal getNuPesq() {
        return nuPesq;
   }

   public void setNuPesq(BigDecimal nuPesq) {
        markAsChanged("NUPESQ", nuPesq);
        this.nuPesq = nuPesq;
   }

   public BigDecimal getSequencia() {
        return sequencia;
   }

   public void setSequencia(BigDecimal sequencia) {
        markAsChanged("SEQUENCIA", sequencia);
        this.sequencia = sequencia;
   }

   @Override
   public String getTableName() {
        return "TPQANE";
   }

   @Override
   public String getEntityName() {
        return "AnexoPergunta";
   }

   @Override
   public AnexoPergunta fromVO(DynamicVO vo) {
        this.setVo(vo);
        this.codPerg = vo.asBigDecimal("CODPERG");
        this.conteudo = vo.asBlob("CONTEUDO");
        this.descricao = vo.asString("DESCRICAO");
        this.nomeArquivo = vo.asString("NOMEARQUIVO");
        this.nuPesq = vo.asBigDecimal("NUPESQ");
        this.sequencia = vo.asBigDecimal("SEQUENCIA");
        return this;
   }
}
