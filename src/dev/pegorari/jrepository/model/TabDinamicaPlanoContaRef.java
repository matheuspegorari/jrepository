package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class TabDinamicaPlanoContaRef extends AbstractSankhyaEntity<TabDinamicaPlanoContaRef> {
   public BigDecimal getTipo() {
        return this.getVo().asBigDecimal("TIPO");
   }

   public void setTipo(BigDecimal tipo) {
        markAsChanged("TIPO", tipo);
   }

   public String getTabela() {
        return this.getVo().asString("TABELA");
   }

   public void setTabela(String tabela) {
        markAsChanged("TABELA", tabela);
   }

   public BigDecimal getAno() {
        return this.getVo().asBigDecimal("ANO");
   }

   public void setAno(BigDecimal ano) {
        markAsChanged("ANO", ano);
   }

   public BigDecimal getCodUsu() {
        return this.getVo().asBigDecimal("CODUSU");
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
   }

   public String getVersao() {
        return this.getVo().asString("VERSAO");
   }

   public void setVersao(String versao) {
        markAsChanged("VERSAO", versao);
   }

   public Timestamp getDtAlter() {
        return this.getVo().asTimestamp("DTALTER");
   }

   public void setDtAlter(Timestamp dtAlter) {
        markAsChanged("DTALTER", dtAlter);
   }

   @Override
   public String getTableName() {
        return "TCBDPLR";
   }

   @Override
   public String getEntityName() {
        return "TabDinamicaPlanoContaRef";
   }

   @Override
   public TabDinamicaPlanoContaRef fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
