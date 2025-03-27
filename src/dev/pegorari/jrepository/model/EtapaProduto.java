package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class EtapaProduto extends AbstractSankhyaEntity<EtapaProduto> {
   public BigDecimal getCicloProducao() {
        return this.getVo().asBigDecimal("CICLOPRODUCAO");
   }

   public void setCicloProducao(BigDecimal cicloProducao) {
        markAsChanged("CICLOPRODUCAO", cicloProducao);
   }

   public BigDecimal getCodEtapa() {
        return this.getVo().asBigDecimal("CODETAPA");
   }

   public void setCodEtapa(BigDecimal codEtapa) {
        markAsChanged("CODETAPA", codEtapa);
   }

   public BigDecimal getCodLocal() {
        return this.getVo().asBigDecimal("CODLOCAL");
   }

   public void setCodLocal(BigDecimal codLocal) {
        markAsChanged("CODLOCAL", codLocal);
   }

   public BigDecimal getCodProd() {
        return this.getVo().asBigDecimal("CODPROD");
   }

   public void setCodProd(BigDecimal codProd) {
        markAsChanged("CODPROD", codProd);
   }

   public String getControle() {
        return this.getVo().asString("CONTROLE");
   }

   public void setControle(String controle) {
        markAsChanged("CONTROLE", controle);
   }

   public String getFinal() {
        return this.getVo().asString("FINAL");
   }

   public void setFinal(String _final) {
        markAsChanged("FINAL", _final);
   }

   public String getObrigatoria() {
        return this.getVo().asString("OBRIGATORIA");
   }

   public void setObrigatoria(String obrigatoria) {
        markAsChanged("OBRIGATORIA", obrigatoria);
   }

   public String getOndeExec() {
        return this.getVo().asString("ONDEEXEC");
   }

   public void setOndeExec(String ondeExec) {
        markAsChanged("ONDEEXEC", ondeExec);
   }

   public BigDecimal getSequencia() {
        return this.getVo().asBigDecimal("SEQUENCIA");
   }

   public void setSequencia(BigDecimal sequencia) {
        markAsChanged("SEQUENCIA", sequencia);
   }

   public String getUnidCiclo() {
        return this.getVo().asString("UNIDCICLO");
   }

   public void setUnidCiclo(String unidCiclo) {
        markAsChanged("UNIDCICLO", unidCiclo);
   }

   public BigDecimal getVariacao() {
        return this.getVo().asBigDecimal("VARIACAO");
   }

   public void setVariacao(BigDecimal variacao) {
        markAsChanged("VARIACAO", variacao);
   }

   @Override
   public String getTableName() {
        return "TGFEPR";
   }

   @Override
   public String getEntityName() {
        return "EtapaProduto";
   }

   @Override
   public EtapaProduto fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
