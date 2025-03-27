package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class CompartilhamentoProcesso extends AbstractSankhyaEntity<CompartilhamentoProcesso> {
   public BigDecimal getCodPrn() {
        return this.getVo().asBigDecimal("CODPRN");
   }

   public void setCodPrn(BigDecimal codPrn) {
        markAsChanged("CODPRN", codPrn);
   }

   public BigDecimal getCodUsu() {
        return this.getVo().asBigDecimal("CODUSU");
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
   }

   public String getPermiteCompartilhar() {
        return this.getVo().asString("PERMITECOMPARTILHAR");
   }

   public void setPermiteCompartilhar(String permiteCompartilhar) {
        markAsChanged("PERMITECOMPARTILHAR", permiteCompartilhar);
   }

   public String getPermiteEdicao() {
        return this.getVo().asString("PERMITEEDICAO");
   }

   public void setPermiteEdicao(String permiteEdicao) {
        markAsChanged("PERMITEEDICAO", permiteEdicao);
   }

   public String getPermiteIniciar() {
        return this.getVo().asString("PERMITEINICIAR");
   }

   public void setPermiteIniciar(String permiteIniciar) {
        markAsChanged("PERMITEINICIAR", permiteIniciar);
   }

   public BigDecimal getSequencia() {
        return this.getVo().asBigDecimal("SEQUENCIA");
   }

   public void setSequencia(BigDecimal sequencia) {
        markAsChanged("SEQUENCIA", sequencia);
   }

   public String getTipUsuGru() {
        return this.getVo().asString("TIPUSUGRU");
   }

   public void setTipUsuGru(String tipUsuGru) {
        markAsChanged("TIPUSUGRU", tipUsuGru);
   }

   @Override
   public String getTableName() {
        return "TWFCPN";
   }

   @Override
   public String getEntityName() {
        return "CompartilhamentoProcesso";
   }

   @Override
   public CompartilhamentoProcesso fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
