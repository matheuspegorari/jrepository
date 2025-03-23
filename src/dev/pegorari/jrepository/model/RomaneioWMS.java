package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class RomaneioWMS extends AbstractSankhyaEntity<RomaneioWMS> {
   private String recontado;
   private String codBarra;
   private String codBarraConcat;
   private BigDecimal codProd;
   private String controle;
   private BigDecimal nuSeparacao;
   private BigDecimal qtdUnpad;
   private BigDecimal sequencia;

   public String getRecontado() {
        return recontado;
   }

   public void setRecontado(String recontado) {
        markAsChanged("RECONTADO", recontado);
        this.recontado = recontado;
   }

   public String getCodBarra() {
        return codBarra;
   }

   public void setCodBarra(String codBarra) {
        markAsChanged("CODBARRA", codBarra);
        this.codBarra = codBarra;
   }

   public String getCodBarraConcat() {
        return codBarraConcat;
   }

   public void setCodBarraConcat(String codBarraConcat) {
        markAsChanged("CODBARRACONCAT", codBarraConcat);
        this.codBarraConcat = codBarraConcat;
   }

   public BigDecimal getCodProd() {
        return codProd;
   }

   public void setCodProd(BigDecimal codProd) {
        markAsChanged("CODPROD", codProd);
        this.codProd = codProd;
   }

   public String getControle() {
        return controle;
   }

   public void setControle(String controle) {
        markAsChanged("CONTROLE", controle);
        this.controle = controle;
   }

   public BigDecimal getNuSeparacao() {
        return nuSeparacao;
   }

   public void setNuSeparacao(BigDecimal nuSeparacao) {
        markAsChanged("NUSEPARACAO", nuSeparacao);
        this.nuSeparacao = nuSeparacao;
   }

   public BigDecimal getQtdUnpad() {
        return qtdUnpad;
   }

   public void setQtdUnpad(BigDecimal qtdUnpad) {
        markAsChanged("QTDUNPAD", qtdUnpad);
        this.qtdUnpad = qtdUnpad;
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
        return "TGWROM";
   }

   @Override
   public String getEntityName() {
        return "RomaneioWMS";
   }

   @Override
   public RomaneioWMS fromVO(DynamicVO vo) {
        this.setVo(vo);
        this.recontado = vo.asString("RECONTADO");
        this.codBarra = vo.asString("CODBARRA");
        this.codBarraConcat = vo.asString("CODBARRACONCAT");
        this.codProd = vo.asBigDecimal("CODPROD");
        this.controle = vo.asString("CONTROLE");
        this.nuSeparacao = vo.asBigDecimal("NUSEPARACAO");
        this.qtdUnpad = vo.asBigDecimal("QTDUNPAD");
        this.sequencia = vo.asBigDecimal("SEQUENCIA");
        return this;
   }
}
