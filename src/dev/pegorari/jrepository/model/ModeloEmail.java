package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class ModeloEmail extends AbstractSankhyaEntity<ModeloEmail> {
   private String assunto;
   private BigDecimal codModelo;
   private BigDecimal codSmtp;
   private char[] conteudo;
   private String descricao;
   private String responderPara;
   private String tipo;
   private BigDecimal codUsuRemet;

   public String getAssunto() {
        return assunto;
   }

   public void setAssunto(String assunto) {
        markAsChanged("ASSUNTO", assunto);
        this.assunto = assunto;
   }

   public BigDecimal getCodModelo() {
        return codModelo;
   }

   public void setCodModelo(BigDecimal codModelo) {
        markAsChanged("CODMODELO", codModelo);
        this.codModelo = codModelo;
   }

   public BigDecimal getCodSmtp() {
        return codSmtp;
   }

   public void setCodSmtp(BigDecimal codSmtp) {
        markAsChanged("CODSMTP", codSmtp);
        this.codSmtp = codSmtp;
   }

   public char[] getConteudo() {
        return conteudo;
   }

   public void setConteudo(char[] conteudo) {
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

   public String getResponderPara() {
        return responderPara;
   }

   public void setResponderPara(String responderPara) {
        markAsChanged("RESPONDERPARA", responderPara);
        this.responderPara = responderPara;
   }

   public String getTipo() {
        return tipo;
   }

   public void setTipo(String tipo) {
        markAsChanged("TIPO", tipo);
        this.tipo = tipo;
   }

   public BigDecimal getCodUsuRemet() {
        return codUsuRemet;
   }

   public void setCodUsuRemet(BigDecimal codUsuRemet) {
        markAsChanged("CODUSUREMET", codUsuRemet);
        this.codUsuRemet = codUsuRemet;
   }

   @Override
   public String getTableName() {
        return "TSIMEM";
   }

   @Override
   public String getEntityName() {
        return "ModeloEmail";
   }

   @Override
   public ModeloEmail fromVO(DynamicVO vo) {
        this.setVo(vo);
        this.assunto = vo.asString("ASSUNTO");
        this.codModelo = vo.asBigDecimal("CODMODELO");
        this.codSmtp = vo.asBigDecimal("CODSMTP");
        this.conteudo = vo.asClob("CONTEUDO");
        this.descricao = vo.asString("DESCRICAO");
        this.responderPara = vo.asString("RESPONDERPARA");
        this.tipo = vo.asString("TIPO");
        this.codUsuRemet = vo.asBigDecimal("CODUSUREMET");
        return this;
   }
}
