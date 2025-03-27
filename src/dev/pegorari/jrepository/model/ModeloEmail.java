package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class ModeloEmail extends AbstractSankhyaEntity<ModeloEmail> {
   public String getAssunto() {
        return this.getVo().asString("ASSUNTO");
   }

   public void setAssunto(String assunto) {
        markAsChanged("ASSUNTO", assunto);
   }

   public BigDecimal getCodModelo() {
        return this.getVo().asBigDecimal("CODMODELO");
   }

   public void setCodModelo(BigDecimal codModelo) {
        markAsChanged("CODMODELO", codModelo);
   }

   public BigDecimal getCodSmtp() {
        return this.getVo().asBigDecimal("CODSMTP");
   }

   public void setCodSmtp(BigDecimal codSmtp) {
        markAsChanged("CODSMTP", codSmtp);
   }

   public char[] getConteudo() {
        return this.getVo().asClob("CONTEUDO");
   }

   public void setConteudo(char[] conteudo) {
        markAsChanged("CONTEUDO", conteudo);
   }

   public String getDescricao() {
        return this.getVo().asString("DESCRICAO");
   }

   public void setDescricao(String descricao) {
        markAsChanged("DESCRICAO", descricao);
   }

   public String getResponderPara() {
        return this.getVo().asString("RESPONDERPARA");
   }

   public void setResponderPara(String responderPara) {
        markAsChanged("RESPONDERPARA", responderPara);
   }

   public String getTipo() {
        return this.getVo().asString("TIPO");
   }

   public void setTipo(String tipo) {
        markAsChanged("TIPO", tipo);
   }

   public BigDecimal getCodUsuRemet() {
        return this.getVo().asBigDecimal("CODUSUREMET");
   }

   public void setCodUsuRemet(BigDecimal codUsuRemet) {
        markAsChanged("CODUSUREMET", codUsuRemet);
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
        return this;
   }
}
