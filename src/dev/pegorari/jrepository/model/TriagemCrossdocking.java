package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class TriagemCrossdocking extends AbstractSankhyaEntity<TriagemCrossdocking> {
   public String getCodBarra() {
        return this.getVo().asString("CODBARRA");
   }

   public void setCodBarra(String codBarra) {
        markAsChanged("CODBARRA", codBarra);
   }

   public BigDecimal getCodProd() {
        return this.getVo().asBigDecimal("CODPROD");
   }

   public void setCodProd(BigDecimal codProd) {
        markAsChanged("CODPROD", codProd);
   }

   public BigDecimal getCodUsuConf() {
        return this.getVo().asBigDecimal("CODUSUCONF");
   }

   public void setCodUsuConf(BigDecimal codUsuConf) {
        markAsChanged("CODUSUCONF", codUsuConf);
   }

   public String getControle() {
        return this.getVo().asString("CONTROLE");
   }

   public void setControle(String controle) {
        markAsChanged("CONTROLE", controle);
   }

   public String getCrossdocking() {
        return this.getVo().asString("CROSSDOCKING");
   }

   public void setCrossdocking(String crossdocking) {
        markAsChanged("CROSSDOCKING", crossdocking);
   }

   public Timestamp getDhAlter() {
        return this.getVo().asTimestamp("DHALTER");
   }

   public void setDhAlter(Timestamp dhAlter) {
        markAsChanged("DHALTER", dhAlter);
   }

   public BigDecimal getNuRecebimento() {
        return this.getVo().asBigDecimal("NURECEBIMENTO");
   }

   public void setNuRecebimento(BigDecimal nuRecebimento) {
        markAsChanged("NURECEBIMENTO", nuRecebimento);
   }

   public BigDecimal getQtdTriada() {
        return this.getVo().asBigDecimal("QTDTRIADA");
   }

   public void setQtdTriada(BigDecimal qtdTriada) {
        markAsChanged("QTDTRIADA", qtdTriada);
   }

   public BigDecimal getQtdTriadaVolPad() {
        return this.getVo().asBigDecimal("QTDTRIADAVOLPAD");
   }

   public void setQtdTriadaVolPad(BigDecimal qtdTriadaVolPad) {
        markAsChanged("QTDTRIADAVOLPAD", qtdTriadaVolPad);
   }

   public BigDecimal getSequencia() {
        return this.getVo().asBigDecimal("SEQUENCIA");
   }

   public void setSequencia(BigDecimal sequencia) {
        markAsChanged("SEQUENCIA", sequencia);
   }

   @Override
   public String getTableName() {
        return "TGWTRCD";
   }

   @Override
   public String getEntityName() {
        return "TriagemCrossdocking";
   }

   @Override
   public TriagemCrossdocking fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
