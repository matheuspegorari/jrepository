package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class ComissaoVendedorGrupo extends AbstractSankhyaEntity<ComissaoVendedorGrupo> {
   public BigDecimal getCodTipParc() {
        return this.getVo().asBigDecimal("CODTIPPARC");
   }

   public void setCodTipParc(BigDecimal codTipParc) {
        markAsChanged("CODTIPPARC", codTipParc);
   }

   public BigDecimal getCodVend() {
        return this.getVo().asBigDecimal("CODVEND");
   }

   public void setCodVend(BigDecimal codVend) {
        markAsChanged("CODVEND", codVend);
   }

   public BigDecimal getComissao() {
        return this.getVo().asBigDecimal("COMISSAO");
   }

   public void setComissao(BigDecimal comissao) {
        markAsChanged("COMISSAO", comissao);
   }

   public BigDecimal getCodGrupoProd() {
        return this.getVo().asBigDecimal("CODGRUPOPROD");
   }

   public void setCodGrupoProd(BigDecimal codGrupoProd) {
        markAsChanged("CODGRUPOPROD", codGrupoProd);
   }

   @Override
   public String getTableName() {
        return "TGFCVG";
   }

   @Override
   public String getEntityName() {
        return "ComissaoVendedorGrupo";
   }

   @Override
   public ComissaoVendedorGrupo fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
