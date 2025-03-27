package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class ComponenteManufatura extends AbstractSankhyaEntity<ComponenteManufatura> {
   public String getDescricao() {
        return this.getVo().asString("DESCRICAO");
   }

   public void setDescricao(String descricao) {
        markAsChanged("DESCRICAO", descricao);
   }

   public BigDecimal getGrau() {
        return this.getVo().asBigDecimal("GRAU");
   }

   public void setGrau(BigDecimal grau) {
        markAsChanged("GRAU", grau);
   }

   public BigDecimal getQtdComp() {
        return this.getVo().asBigDecimal("QTDCOMP");
   }

   public void setQtdComp(BigDecimal qtdComp) {
        markAsChanged("QTDCOMP", qtdComp);
   }

   public String getAnalitico() {
        return this.getVo().asString("ANALITICO");
   }

   public void setAnalitico(String analitico) {
        markAsChanged("ANALITICO", analitico);
   }

   public String getAtivo() {
        return this.getVo().asString("ATIVO");
   }

   public void setAtivo(String ativo) {
        markAsChanged("ATIVO", ativo);
   }

   public BigDecimal getCodCpm() {
        return this.getVo().asBigDecimal("CODCPM");
   }

   public void setCodCpm(BigDecimal codCpm) {
        markAsChanged("CODCPM", codCpm);
   }

   public BigDecimal getCodCpmPai() {
        return this.getVo().asBigDecimal("CODCPMPAI");
   }

   public void setCodCpmPai(BigDecimal codCpmPai) {
        markAsChanged("CODCPMPAI", codCpmPai);
   }

   @Override
   public String getTableName() {
        return "TPRCPM";
   }

   @Override
   public String getEntityName() {
        return "ComponenteManufatura";
   }

   @Override
   public ComponenteManufatura fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
