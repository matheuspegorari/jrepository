package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.math.BigDecimal;

public class AnexoPergunta implements SankhyaEntity<AnexoPergunta> {

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
        this.codPerg = codPerg;
   }

   public byte[] getConteudo() {
        return conteudo;
   }

   public void setConteudo(byte[] conteudo) {
        this.conteudo = conteudo;
   }

   public String getDescricao() {
        return descricao;
   }

   public void setDescricao(String descricao) {
        this.descricao = descricao;
   }

   public String getNomeArquivo() {
        return nomeArquivo;
   }

   public void setNomeArquivo(String nomeArquivo) {
        this.nomeArquivo = nomeArquivo;
   }

   public BigDecimal getNuPesq() {
        return nuPesq;
   }

   public void setNuPesq(BigDecimal nuPesq) {
        this.nuPesq = nuPesq;
   }

   public BigDecimal getSequencia() {
        return sequencia;
   }

   public void setSequencia(BigDecimal sequencia) {
        this.sequencia = sequencia;
   }

   @Override
   public String getEntityName() {
        return "AnexoPergunta";
   }

   @Override
   public AnexoPergunta fromVO(DynamicVO vo) {
        this.codPerg = vo.asBigDecimal("CODPERG");
        this.conteudo = vo.asBlob("CONTEUDO");
        this.descricao = vo.asString("DESCRICAO");
        this.nomeArquivo = vo.asString("NOMEARQUIVO");
        this.nuPesq = vo.asBigDecimal("NUPESQ");
        this.sequencia = vo.asBigDecimal("SEQUENCIA");
        return this;
   }
}
